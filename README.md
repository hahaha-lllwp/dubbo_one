dubbo_one

搭建一个springboot启动web+dubbo的服务

API
1.先在api目录下，把工具依赖、dubbo依赖、spring相关依赖加到api的pom文件里（也可以单独放在其他项目里，集成在API里方便管理）；
2.在api中新建任意包，新建一个接口，添加一个简单的方法。


Provider（dubbo_one）
1.新建项目，把依赖添加到pom文件里，由于工具类依赖、spring依赖、dubbo依赖都在api里，所以只需要依赖api即可。
2.声明一个类实现api中的接口方法，要在下面的配置文件中配置暴露出来。
3.dubbo-demo-provider.xml配置文件，里面是dubbo相关的一下配置，具体的配置见文件。
4.用test中的main方法就可以启动这个provider了，但是还不能打包直接扔到线上用。