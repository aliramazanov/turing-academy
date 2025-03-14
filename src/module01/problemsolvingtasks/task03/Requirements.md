# Working with strings

## The task:

You will need to write a "week planner" program

#### Technical requirements

- Create a two-dimensional array of 7x2 strings
  String[][] schedule = new String[7][2]
- Fill the matrix with the following values: weekday + the main task for the current day:
  schedule [0][0] = "Sunday";  
  schedule[0][1] = "do homework";  
  schedule[1][0] = "Monday";  
  schedule[1][1] = "go to courses; watch a film";
    - Using a loop and a switch operator, request the user to input a weekday in the console. Depending on the input:

    1) Please, input the day of the week:   
       The user enters a correct weekday (e.g. `Monday`) ,
       the program outputs: `Your tasks for Monday: go to courses; watch a film.`;
       Then the program goes to the next iteration.
    2) Please, input the day of the week:
       The user enters a non-valid weekday (e.g. `%$=+!11=4`)    
       the program outputs: `Sorry, I don't understand you, please try again.`; the program goes to the next iteration
       until the user enters a valid weekday
       3)`Please, input the day of the week: `
       The user enters exit  
       The program goes out of the loop
- The task must be done using arrays (**DON'T** use interfaces`List`, `Set`, `Map`).

  Please note: the program should accept commands in both lower case (`Monday`) and upper case (`MONDAY`) and take into
  account that the user may have accidentally entered a space after the day of the week.

#### Advanced complexity. Not necessary to implement:

Improve the program so that when the user enters the phrase change [day of the week]
or `reschedule [day of the week]`, the program offers to enter new tasks for a given day of the week and saves them in
the appropriate cell of the array, while removing the old tasks. After that the program goes onto the next iteration
before the user enters `exit `.

- Please, input the day of the week:
    - the user enters change Monday
    - the program suggests to enter new tasks for monday`Please, input new tasks for Monday.`
    - the user enters new tasks in the console
    - the console saves the new tasks into the corresponding cell
    - the program goes onto the next iteration and in case of a Monday input, it outputs the new tasks