# THE CLEAN CODERS CRM

Welcome to the <b> cleanCRM </b>, the best tool to track current and potential customers in your sales processes.

This CRM will help you:

· Bring together important information about potential new customers.

· Convert leads into sales opportunities once they show interest in purchasing your product.

· Store all your contacts information.

· Associate contacts with an opportunity.

· Associate an opportunity with an account.

## Getting started

### Clone, compile and run the game in your terminal

1. Clone the repository
```
git clone https://github.com/EN-IH-WDPT-JUN21/TheCleanCoders-CRM-Homework-2.git
```
2. Go to the src directory
```
cd your_path_to_project/TheCleanCoders-CRM-Homework-2
```
3. Compile the source files
```
javac 
```
4. Run the program
```
java src/Main/Main.java
```

### Run the game through an IDE

1. Download ZIP file of the project

![zipdownload.png](https://github.com/EN-IH-WDPT-JUN21/TheCleanCoders-MugglesAgainstMagic-Homework-1/blob/main/img/zipdownload.png)

2. Extract the ZIP file and open the directory as a project on an IDE such as IntelliJ

3. Run the Main.Main.java file
   During its use type "HELP" for commands information.

## How the CRM simulator works

The <b>cleanCRM</b> is very intuitive to use, however, if you are using it for the first time, it is normal to face some doubts about the command line. If so, please type "HELP" for further information.

### Commands available :

- NEW < Object type > . . . . . . . . . . . . . . . . . ._creates a new Object_
- SHOW < Object type > . . . . . . . . . . . . . . . . _lists all Objects of the selected type_
- LOOKUP < Object type > < Id number > . . ._display the selected Object type related to the Id number_
- CONVERT < Lead Id > . . . . . . . . . . . . . . . . _converts the selected LEAD in CONTACT, OPPORTUNITY and ACCOUNT_
- CLOSE-WON < Account Id > . . . . . . . . . . . _changes the selected ACCOUNT status to WON_
- CLOSE-LOST < Account Id > . . . . . . . . . . ._changes the selected ACCOUNT status to LOST_
- OPEN < Account Id > . . . . . . . . . . . . . . . . . _changes the selected ACCOUNT status to OPEN_
- SAVE . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ._save data to external csv files_
- HELP . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ._displays the help info_
- EXIT . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . _terminate the cleanCRM program_

### Object types :

- Lead
- Contact
- Opportunity
- Account

** All Object types accepted in plural (e.g OPPORTUNITY and OPPORTUNITIES are both accepted forms)
<br> ** All commands are case-insensitive

## Diagrams

<b>· Use case diagram : </b>

<b>· Class diagram : </b>

## Screenshots

## Authors

**TheCleanCoders**: Vitaliano Costa, Maravillas Fernández, Joao Lopes, Natalia Norberciak, Katarzyna Wąsik.
![CleanCodersLogo.JPG](https://github.com/EN-IH-WDPT-JUN21/TheCleanCoders-MugglesAgainstMagic-Homework-1/blob/main/img/CleanCodersLogo.JPG)