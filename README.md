# 2.2.1 创建可被发现的bean
- 使用IntelliJ IDEA创建项目
- 使用Gradle管理包和Java项目
- 添加Spring核心包
- 使用JUnit测试Java项目和Spring Java项目
- 使用Spring配置类
- 创建Spring配置文件（xml格式）

# 2.2.2 为组建扫描的bean命名

# 2.2.3 设置组建扫描的基础包

# 2.2.4 通过为bean添加注解实现自动装配

- 创建MediaPlayer接口

  ```java
  package soundsystem;
  public interface MediaPlayer {
      void play();
  }
  ```

- 创建CDPlayer类

- 添加自动装配属性

# 2.2.5 验证自动装配

- 引入System Rules库，StandardOutputStreamLog需改为新用法

  ```java
  public class MyTest {
  	@Rule
  	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

  	@Test
  	public void writesTextToSystemOut() {
  		System.out.print("hello world");
  		assertEquals("hello world", systemOutRule.getLog());
  	}
  }
  ```
- ​重写CDPlayerTest测试类

# 2.3.1 创建配置类

- 移除CDPlayerConfig的@ComponentScan注解
- 运行测试看结果
- 加上移除CDPlayerConfig的@ComponentScan注解

# 2.3.2 声明简单的bean

- 移除CDPlayerConfig的@ComponentScan注解

- 使用@Bean注解

- 添加@Bean的name

- 此时还无法通过测试

# 2.3.3 借助JavaConfig实现注入

- 添加CDPlayer的Bean

- 移除@Bean的name

- 运行测试看结果

# 2.4.1 创建XML配置规范

- 使用xml模板文件

- 注释掉现有的component-scan


# 2.4.2 声明一个简单的<bean>

- 添加带id的bean

# 2.4.3 借助构造器注入初始化bean

- 编写xml注入对象创建bean
- 注释掉CDPlayerConfig类中的全部代码，用@import引入xml配置文件
- 测试运行
- 使用c命名空间重新声明bean并测试运行
- 创建BlankDisc类
- 将配置文件里的compactDisc替换为BlankDisc类并测试运行
- 改用c命名空间重新配置bean并运行
- 在BlankDisc里添加音轨描述
- 在xml配置文件中注入列表的值并测试运行，查看测试报告 

# 2.4.4 设置属性
- 修改CDPlayer类，添加set方法
- 修改xml配置，CDPlayer改用属性注入，测试运行查看报告
- 修改xml配置，用p命名空间注入属性，测试运行查看报告
- 修改BlankDisc类，改用set方法设置属性值
- 修改xml配置，BlankDisc改用属性注入，测试运行查看报告
- xml配置引入util命名空间并创建音轨信息集合
- 修改xml配置，用p命名空间注入BlankDisc属性，测试运行查看报告

# 2.5.1 在JavaConfig中引用XML配置

- 创建CDConfig类
- 将CDConfig导入到CDPlayerConfig，修改代码，运行通过测试
- 创建SoundSystemConfig导入CDConfig与CDPlayerConfig，运行通过测试
- 创建cd-config.xml在SoundSystemConfig导入XML配置，运行通过测试

# 2.5.2 在XML配置中引用JavaConfig

- 修改SoundSystemConfig导入beans.xml，去掉其它导入
- 修改beans.xml引用cd-config.xml，运行通过测试
- 修改beans.xml引用CDConfig，运行通过测试
- 新建cdplayer-config.xml，将其引入beans.xml，运行通过测试

# 3.1.1 配置profile bean
- 创建DevelopmentCDConfig类作为开发环境的CD配置类
- 修改beans.xml，导入DevelopmentCDConfig类和cd-config.xml
- 修改cd-config.xml，添加profile的定义

# 3.1.2 激活profile
- 在web.xml中设置profile默认值
- 在测试环境中设置profile值，分别运行测试“dev”值和“prod”值

# 3.3.1 标示首选的bean
- 修改CDConfig中的compactDisc函数名为compactDiscSP

- 添加新的Immortals类

- 在CDConfig中添加返回Immortals实例的compactDiscIm函数

- 修改cdplayer-config.xml，去掉cdPlayer的bean的输入参数

- 修改beans.xml添加对CDConfig配置类的引用，去掉对cd-config.xml的引用

- 运行测试，会出现NoUniqueBeanDefinitionException，应为可选bean有多个，不能自动装配

- 修改CDConfig在compactDiscIm函数上添加@Primary，指定首选bean，运行测试，自动装配成功

# 3.3.2 限定自动装配的bean
- 修改CDConfig类，去掉Primary标示
- 修改CDConfig在compactDiscSP函数上添加@Qualifier("SP")
- 修改CDPlayer，去掉带参数构造函数，添加setCompactDisc并用@Qualifier("SP")指定自动绑定的bean
- 修改CDPlayerConfig，改为默认构造函数创建bean，运行通过测试

# 3.4.1 使用会话和请求作用域
- 所有的bean是单例模式创建的
- 可以用使用@Scope注解设置作用域
- Web应用中可以使用Session和Request作用域

# 3.4.2 在XML中声明作用域代理