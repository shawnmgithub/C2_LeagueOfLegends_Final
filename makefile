Main.class: Main.java MultiPanel.class User.class
	javac Main.java
MultiPanel.class: MultiPanel.java
	javac MultiPanel.java
User.class:
	javac User.java
run: Main.class
	java Main
clean:
	rm *.class
superClean:
	rm *.class
	rm *.dat
