# CSC207 Fall 2020
## Assignment 0: Java/Git Warmup - Instructions

### Before you start
**(Tentative) marking scheme** You will be graded on the correctness of your code (you should also always aim to follow good design principles, keep things simple and clean), and on having multiple commits pushed to the repository -- do NOT just commit+push once at the end! 20\% of this assignment's grades is for using git effectively (which involves making commits often, as suggested within the instructions below).

### Task 1
Use "git clone \[url\]" to download the assignment repository onto your local computer at your desired location (remember to use "cd <directory name>" to go to the folder where you want your repo to be cloned to, before doing "git clone"). You should now have a folder called "a0" in that repo.

### Task 2
Open Eclipse. Then choose File > Open Projects from File System, click on the "Directory..." button, navigate to your a0 folder, select the folder, and click "Open". You should now see "a0" on the "Package Explorer" sidebar on Eclipse. Expand "a0" to view the .java files we will work with.

### Task 3
Read through all the given starter code and make sure you understand how everything works. You will not be able to play the game yet due to an error -- you will fix this shortly. For now, just read through the documentation and understand all the code provided to you. (Note: do NOT modify TicTacToeDriver.java for any part of this assignment; you will always work with TicTacToe.java ONLY)

### Task 4 (commit+push required at this step for full marks!)
There is one line of code in TicTacToe.java preventing this program from compiling. Fix that one line and then ADD TicTacToe.java to your git repo, then COMMIT and PUSH your changes with an appropriate commit log message before doing anything else in this assignment. (refer to the exercise from lecture 2 on how to commit+push changes into a git repo if needed). Now you can play the game by opening the TicTacToeDriver.java file and running this file (don't run the TicTacToe file, run the driver file).

#### Task 4.5
Did you commit+push your answer for Task 4? You can open up your Github assignment repo in your browser to double check that your changes from task 4 can be seen in the remote repo on your browser. Double check this before moving on to Task 5 below.

### Task 5 (commit+push required for full marks!)
You may notice that a diagonal win is not recognized by the game. Complete the checkWinDiag method in TicTacToe.java according to its JavaDoc. COMMIT and PUSH your changes. (Again, double check that your push went through by checking your repo status in any internet browser.)

### Task 6 (commit+push required!)
What currently occurs when a draw happens in the game? Complete the isBoardFull method in TicTacToe.java according to its JavaDoc to fix this issue. COMMIT and PUSH your changes. (Again, double check that your push went through by checking your repo status in any internet browser.)

### Task 7 (double check the code runs)
Double check that everything in your files work as expected. RUN the TicTacToeDriver.java file one last time -- if your file does not run, you will immediately get 0 on this assignment as all our auto-tests will fail! So make sure your code runs! We will NOT be making exceptions and fixing up minor issues for you to make your code run; it is your responsibility to make sure that the code is working, and that the driver file can at least run without any compilation errors. Or else it's an auto 0 on the assignment.

### Task 8 (clean up your file)
If you added in extra print statements, or have redundant code in your methods, etc. clean all this up. Delete your extra statements or comments that you made only for yourself. Clean up and simplify your code as much as you can. Add, commit and push your final TicTacToe.java file (remember, you should NOT have edited the driver file at all throughout your assignment).

### You are done!

**How to submit?** You're already done submitting. :) We will be pulling your Github repos and grading the final commit that's in your remote repos. We will also look over your commit history (you should have at least 3 different commits for task 4, 5, and 6, if not more).

**Any questions?** Ask on Piazza or come to office hours!
