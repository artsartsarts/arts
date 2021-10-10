class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee e : employees) {
            map.put(e.id, e);
        }
        return getImportanceDFS(map, id);
        
    }
    
    public int getImportanceDFS(Map<Integer, Employee> map, int id) {
        Employee e = map.get(id);
        int result = e.importance;
        for (int subId : e.subordinates) {
            result += getImportanceDFS(map, subId);
        }
        return result;
    }
    
}
