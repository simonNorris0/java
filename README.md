# java
https://www.jgrasp.org/

      // ** using foreach with ints requires initializing the integer array
      //    with a traditional for statement anyways.. 
      //    ** MAKE A JAVA CLASS WITH STATIC METHODS TO BUILD INT ARRAYS
      //       FOR DOING THIS
      int[] ints = new int[100]; // initialize array by length
      for(int i=0, j=0; i<100; i++ , j++) // comma operator.. see Unit1-4 Notes/text
         ints[i] = j;
      for(int i : ints) {
      // **
