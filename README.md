# 部署



把项目打包后在自己的Linux服务器运行

```
yum  install -y java-1.8.0-openjdk.x86_64
yum  install -y java-1.8.0-openjdk-devel
```

安装java



在根目录创建一个名为 fileEndpoint 的文件夹用来存放要保存的文件

```
mkdir -p /fileEndpoint
```



```
chmod 777 /fileEndpoint
```

在用java启动jar包

```
java -jar fileEndpoint-0.0.1-SNAPSHOT.jar
```

即可

也可以后台运行

```
nohup java -jar fileEndpoint-0.0.1-SNAPSHOT.jar &
```



# 使用

在其他Linux系统中想要保存文件时

使用命令

```
curl -F "file=@文件名" -X POST "http://ip或者域名"
```

即可

文件会被保存到根目录的 fileEndpoint 文件夹



# 配置

默认设置文件的传输大小为 2048MB

```
spring.servlet.multipart.max-file-size=2048MB
spring.servlet.multipart.max-request-size=2048MB
```

