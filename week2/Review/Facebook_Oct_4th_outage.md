https://engineering.fb.com/2021/10/05/networking-traffic/outage-details/

一条测试命令因为命令验证系统bug，让它生效了,然后这条命令恰巧把DNS服务器给黑洞了。然后DNS服务器会检测其它站点的可达性，然后针对不健康的站点主动的撤销BGP路由来将一些站点下线，最后因为这个黑洞，把备用的两台DNS也下线了，以及将所有的其它服务器的路由全下线了。
