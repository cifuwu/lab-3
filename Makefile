JCC =	javac
JFLAGS =	-Xlint:all -g

.SUFFIXES: .java .class
.java.class:
	$(JCC) $(JFLAGS) $*.java

CLASSES	= *.java

run:
	javac Tarea/*.java
	java Tarea/Main

clean:
	rm -rf *.class