# How to create executable jar file in java?
In this example we are going to make executable jar file for your `HelloWorld.java`.
### Step 1. Create `HelloWorld.java` file.

```
public class HelloWorld{
  public static void main(String[] args){
    System.out.println("Hello World!");
  }
}
```
### Step 2. Compile and it will automatically create `HelloWorld.class` file.
### Step 3. Now create `Manifest.txt` file with following content. 
```
Main-Class: HelloWorld
```
##### Note: You must create `Manifest.txt` file in same location where `HelloWorld.class` file is located.

### Step 4. Now to create jar file run following code in command line.
```
jar -cvfm HelloWorld.jar manifest.txt HelloWorld.class
```
It will create `HelloWorld.jar` file.
### Step 5. To run jar file use fullowing command.
```
java -jar HelloWorld.jar
```
