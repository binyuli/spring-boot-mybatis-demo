# spring-boot-mybatis-demo
## 关于 pom 文件
* 本项目中仅引入了刚好能支持 spring,spring-mvc,mybatis 创建基本服务的 jar 包，其他功能可在此基础上进行延展
## 关于 mapper
* 提供了两种 mybatis 注入的方式,建议在 spring-boot 中使用基于注解的方式,因为在以 java -jar 的方式启动基于配置文件的 boot 项目时会报错(但在IDE中以 run as Application
的方式或外部 web 容器都正常,很诡异);
## 关于几个 controller
* Application 是项目启动入口在 IDE 中也经常运行它来做测试，这不用说，要强调的是 StarterOutside , 在外部 web 服务器部署项目时需要用到其当中的配置(打包时注意打成 war);
* HelloController 与 SampleController 比较了传统的 @Controller 注解与 spring-boot 中惯用的 @RestController 注解在配置上的细微差别;
* UserController 是 mybatis 两种注入 mapper 方式的案例，post请求如果懒得用其他工具可在 /newUser.html 页面中进行。在单独使用基于注解的方式开展项目时，记得将 application.properties/yml 文件当中的 mybatis.mapperLocations
去掉;
## 配置文件
* spring-boot 支持两种格式的配置文件，在本项目中我都有实现(application.yml与application_old.properties)，系统默认使用的是 application.* (*为properties或yml);
