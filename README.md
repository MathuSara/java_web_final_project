# java_web_final_project
Web Applications Build and Deploy Exercise

1.Go over to spring initializr and create your project: https://start.spring.io/ <br>
  a.Under project select: Maven project<br>
  b.Under Language select: Java<br>
  c.Under Spring Boot select: 3.0.0 (Highest version that is not (SNAPSHOT or RC1)<br>
  d.Under Project Metadata, for artifact enter: java_web_final_project<br>
  e.Under Packaging select: Jar<br>
  f.Under Java select your version of Java: 19<br>
  g.Click Add Dependencies and select: Spring Web, Spring Data JPA, MySQL Driver.<br>
  h.Click: GENERATE<br>
Or you can use this pre-initialized project<br><br>

2.Your objectives for the api portion of the project are as follows<br>
  a.You will model some data of your choosing (in class we used Candy and Songs, for example)<br>
    i.This data must have at least two instance fields other than an id<br>
    ii.This data must have an id field that is automatically generated by Spring Data JPA<br>
  b.Your data will be persisted MySQL database<br>
  c.Your controller must have routes for all four main CRUD methods (Get, Post, Put, Delete)<br>
3.In your src directory, add a frontend/build directory where you will add some frontend pages to your site<br>
4.In your pom.xml, add the below code just before the closing </project> tag<br><br>

<profiles><br>
   <profile><br>
      <id>build-frontend</id>
      <activation>
         <activeByDefault>true</activeByDefault>
      </activation>
      <build>
         <plugins>
            <plugin>
               <artifactId>maven-resources-plugin</artifactId>
               <executions>
                  <execution>
                     <id>copy-build-folder</id>
                     <phase>process-classes</phase>
                     <goals>
                        <goal>copy-resources</goal>
                     </goals>
                     <configuration>
                        <resources>
                           <resource>
                              <directory>src/frontend/build</directory>
                           </resource>
                        </resources>
                        <outputDirectory>${basedir}/target/classes/static</outputDirectory>
                     </configuration>
                  </execution>
               </executions>
            </plugin>
         </plugins>
      </build>
   </profile>
</profiles>

5.In your new frontend/build directory, add an index.html file and an index.js file<br>
6.Your frontend pages will<br>
  a.Display data in an organized way in the home address on your webpage<br>
  b.Use asynchronous JS to make CRUD requests to the backend of your web application<br>
    i.For get requests, you must use DOM manipulation to dynamically add the data retrieved from your HTTP request to your index.html page<br>
    ii.For all other requests, you must use DOM manipulation to dynamically retrieve data from your webpage and incorporate it into an HTTP request to the backend of your application<br>

7.Build and execute your the jar file for your completed project. If your jar file, when run, shows a dynamic webpage at the home address of your web application that makes use of data stored in the backend of your app, then you may submit your .jar file on canvas at any time.<br>
8.With any time that you have remaining<br>
  a.Style your webpage and make it yours!<br>
  b.Add more pages to your frontend that make different types of HTTP requests to your backend.<br>
  c.Containerize your application<br>
  d.Make your api more RESTful by adding HATEOAS links<br>
