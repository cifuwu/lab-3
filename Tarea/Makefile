compile: Main.java FOO.java Datos.java
	@ javac -cp "json-simple-1.1.1.jar" *.java
	@ jar -cmvf Manifest.txt Main.jar *.class

run:
	@ java -jar Main.jar

clean:
	@echo Eliminando archivos
	@ rm *.class
	@ rm *.jar
	@echo Archivos eliminados!
