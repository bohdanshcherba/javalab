# Java Lab 7


#How run code
### RUN IN AN IDE

If you want to run the examples in an IDE, such as Eclipse, you should
be able to copy-and-paste the entire contents of any one of the chapter folders
into a project in the IDE, and then run the programs.  For GUI programs,
which use JavaFX, you will very likely need to configure Eclipse as
discussed in Section 2.6 of the book.  Note: When adding items to
an Eclipse project, do not copy the chapter folder itself; open the 
folder and copy the contents into the src folder in the Eclipse project.
You can put the examples from several chapters into the same project if you 
want; some files, such as TextIO.java, are duplicated in several chapters,
but any two files with the same name are identical, and you only need one
copy of the file in your project.


### COMPILE AND RUN ON THE COMMAND LINE 

If you know how to compile programs on the command line, and if you have
downloaded the examples, you can easily compile and run all the examples.
For non-GUI programs, just change into one of the chapter directories inside 
the "sources" directory, and use a command of the form

                  javac ExampleClassName.java
                  
For example:
                  javac HelloWorld.java
                  
As long as your compiler supports Java 8 or higher, there should be no errors.  
(You might see some warnings, especially if you use a newer version of Java, 
but warnings do not stop a program from being compiled or executed.)  You can 
then run the compiled programs using the java command.  For example:

                  java HelloWorld
                  
For GUI programs, which use JavaFX, you will have to add command-line options to
the javac and java commands, as discussed in Section 2.6 of the textbook,
but the basic idea is the same.
                  
Several examples from Chapter 12, Section 5 and the Mandelbrot Set example
from Chapter 13, Section 5 use packages.  The source files for these examples
can be found in the directories chapter12/netgame and chapter13/edu.  Compiling
and running programs from packages is a little harder; see the discussions in
the textbook in the relevant sections.
#Task 


>Завдання
 Створити консольну програму мовою Java і написати клас із вашої лабораторної роботи 1:
 Додаткових 5 приватних полів, які найкраще описують даний клас (додатково до полів, вказаних в таблиці)
 Методи доступу до цих полів (наприклад для поля name – getName() і setName())
 Статичне поле (числового типу)
 Для кожного класу слід додати 2 захищених поля (protected)
 Поля з пунктів 3 і 4 мають представляти атрибути описуваного класу
 Дефолтний конструктор, конструктор з чотирма параметрами (першими чотирма властивостями з п.1) і конструктор з усіма полями. При роботі з конструкторами слід переадресовувати виклик в один з конструктор з-за допомогою this та уникати копіювання коду
 Методи
 toString - вивести інформацію про об’єкт
 Статичний метод printStaticField() - виводить інформацію про значення статичного поля (де Field - назва поля)
 Метод printField()  - виводить інформацію про значення статичного поля
 resetValues(параметри) - змінює значення всіх полів на передані в параметрах
 Розроблений код має бути залито в гіт репозиторій! В репозиторії мать бути README і .gitignore файл. 

>> В main() методі визначіть 3 об’єкти типу із завдання (з-за допомогою різних конструкторів) та виведіть інформацію про них з-за допомогою методу toString() та виведіть інформацію за допомогою методів printStaticField() і printField() 

