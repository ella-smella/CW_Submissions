//PART ONE: MODULUS
//What would each of the following 1-6 lines including the modulo operator cause to be printed?
     System.out.println(14 % 13);
Print Out: 1
     System.out.println(8 % 11);
Print Out: 8
     System.out.println(6 % 2);
Print Out: 0
     System.out.println(7 % 2);
Print Out: 1
     System.out.println(274 % 10);
Print Out: 4
     System.out.println(881 % 2);
Print Out: 1

//PART TWO: COMPOUND OPERATORS AND SHORTCUTS (credits to runestone.academy)

    int x = 0;
    int y = 1;
    int z = 2;
    x--; // x followed by the double minus sign
    y++;
    z+=y;
//After the above code runs, what are x, y, and z equal to?
x = -1
y = 2
z = 4

    int a = 3;
    int b = 5;
    int c = 2;
    a = c * 2;
    b = b / 2;
    c++;
//After the above code runs, what are a, b, and c equal to?
a = 4
b = 2 
c = 3

//PART THREE: CASTING

    int total = 5 + 7 + 2;
    (double) (total / 3); //Option A
    total / 3; //Option B
    (double) total / 3; //Option C

//Which of the above options correctly computes the average of total? Why do the other options not work?
Option C works. 

Option A does not work because it will first divide the total by 3 as a truncated integer, then convert that integer into a double, which will produce an incorrect result. 
Option B does not work because it divides the total by 3 as a truncated integer, not as a double, which is incorrect. 
