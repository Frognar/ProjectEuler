(ns problem-2.core-spec
  (:require [speclj.core :refer :all]
            [problem-2.core :refer :all]))

(describe "Fibonacci sequence"
          (it "should be [] for n <= 0"
              (should= [] (fibonacci-sequence -2))
              (should= [] (fibonacci-sequence 0)))
          (it "should be [1] for n = 1"
              (should= [1] (fibonacci-sequence 1)))
          (it "should be [1 1] for n = 2"
              (should= [1 1] (fibonacci-sequence 2)))
          (it "should be [1 1 2] for n = 3"
              (should= [1 1 2] (fibonacci-sequence 3)))
          (it "should be [1 1 2 3] for n = 4"
              (should= [1 1 2 3] (fibonacci-sequence 4)))
          (it "should be [1 1 2 3 5 8 13 21 34 55 89 144 233 377 610] for n = 15"
              (should= [1 1 2 3 5 8 13 21 34 55 89 144 233 377 610] (fibonacci-sequence 15)))
          )

(describe "Sum even fibonacci numbers up to n"
          (it "should be 0 for n < 3"
              (should= 0 (sum-first-n-even-fibonacci-numbers 0))
              (should= 0 (sum-first-n-even-fibonacci-numbers 1))
              (should= 0 (sum-first-n-even-fibonacci-numbers 2)))
          (it "should be 2 for 2 > n > 6"
              (should= 2 (sum-first-n-even-fibonacci-numbers 3))
              (should= 2 (sum-first-n-even-fibonacci-numbers 4))
              (should= 2 (sum-first-n-even-fibonacci-numbers 5)))
          (it "should be 10 for 5 > n > 9"
              (should= 10 (sum-first-n-even-fibonacci-numbers 6))
              (should= 10 (sum-first-n-even-fibonacci-numbers 7))
              (should= 10 (sum-first-n-even-fibonacci-numbers 8)))
          )

(run-specs)