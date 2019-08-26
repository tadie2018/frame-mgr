#                                框架管理 : 微服务组件 服务治理
### Author：zhangdong Time: 2019-8-25
* mgr-ms-eureka : 注册中心
* 注册中心高可用 : 地址关联、互相指定
* 三个地址则指定除自己之外的另两个地址，客户端配置所有注册中心即可
* client使用逗号分隔多个eureka地址
* for example: http://localhost:6111/eureka/,http://localhost:6112/eureka/,http://localhost:6113/eureka/
