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