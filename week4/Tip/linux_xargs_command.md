xargs可以把两个命令行串行起来，使得前一个命令行的输出成为后一个命令行的输入

比如
echo 'one two three' | xargs mkdir
ls
one two three
创建名为‘one’,'two','three'的文件夹

find /tmp -mtime +14 | xargs rm
删除find 命令行找到的文件

https://shapeshed.com/unix-xargs/



