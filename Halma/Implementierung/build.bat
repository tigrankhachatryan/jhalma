@echo off
echo Compiling model
javac -classpath .\ .\model\*.java
echo Compiling view
javac -classpath .\ .\view\*.java
echo Compiling controller
javac -classpath .\ .\controller\*.java
echo Compiling test-package
javac -classpath .\ .\test\*.java
echo done