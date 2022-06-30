(ns problem-6.core-spec
  (:require [speclj.core :refer :all]
            [problem-6.core :refer :all]))

(describe "Sum of the squares of the first n numbers"
          (it "should be 1 if n = 1"
              (should= 1 (sum-of-squares-up-to 1)))
          (it "should be 5 in n = 2"
              (should= 5 (sum-of-squares-up-to 2)))
          (it "should be 385 if n = 10"
              (should= 385 (sum-of-squares-up-to 10)))
          )

(describe "Square of the sum of first n numbers"
          (it "should be 1 if n = 1"
              (should= 1 (square-of-sum-up-to 1)))
          (it "should be 9 if n = 2"
              (should= 9 (square-of-sum-up-to 2)))
          (it "should be 3025 if n = 10"
              (should= 3025 (square-of-sum-up-to 10)))
          )

(describe "Difference between the sum of the squares of the first n numbers and the square of the sum"
          (it "should be 0 if n = 1"
              (should= 0 (sum-square-difference 1)))
          (it "should be 4 if n = 2"
              (should= 4 (sum-square-difference 2)))
          (it "should be 2640 if n = 10"
              (should= 2640 (sum-square-difference 10)))
          (it "should be 25164150 if n = 100"
              (should= 25164150 (sum-square-difference 100)))
          )

(run-specs)