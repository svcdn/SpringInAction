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