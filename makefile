default: cpsc2150/banking/MortgageApp.java cpsc2150/banking/controllers/*.java cpsc2150/banking/views/*.java cpsc2150/banking/models/*.java
	javac cpsc2150/banking/MortgageApp.java cpsc2150/banking/controllers/*.java cpsc2150/banking/views/*.java cpsc2150/banking/models/*.java

run:
	java cpsc2150.banking.MortgageApp

clean:
	rm -f cpsc2150/banking/controllers/*.class
	rm -f cpsc2150/banking/views/*.class
	rm -f cpsc2150/banking/models/*.class
	rm -f cpsc2150/banking/*.class