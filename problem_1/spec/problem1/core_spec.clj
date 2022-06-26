(ns problem1.core-spec
  (:require [speclj.core :refer :all]
            [problem1.core :refer :all]))

(describe "Sum of multiples of 3 and 5"
          (it "should be zero if limit less than 3"
              (should= 0 (sum-multiples-3-5 0))
              (should= 0 (sum-multiples-3-5 1))
              (should= 0 (sum-multiples-3-5 2)))

          (it "should be 3 for limit = 3 or 4"
              (should= 3 (sum-multiples-3-5 3))
              (should= 3 (sum-multiples-3-5 4)))

          (it "should be 8 for 5"
              (should= 8 (sum-multiples-3-5 5)))

          (it "should be 14 for 6, 7, and 8"
              (should= 14 (sum-multiples-3-5 6))
              (should= 14 (sum-multiples-3-5 7))
              (should= 14 (sum-multiples-3-5 8)))

          (it "should be 23 for 9"
              (should= 23 (sum-multiples-3-5 9)))

          (it "should be 33 for 10 and 11"
              (should= 33 (sum-multiples-3-5 10))
              (should= 33 (sum-multiples-3-5 11)))

          (it "should be 45 for 12, 13, and 14"
              (should= 45 (sum-multiples-3-5 12))
              (should= 45 (sum-multiples-3-5 13))
              (should= 45 (sum-multiples-3-5 14)))

          (it "should be 60 for 15, 16, and 17"
              (should= 60 (sum-multiples-3-5 15))
              (should= 60 (sum-multiples-3-5 16))
              (should= 60 (sum-multiples-3-5 17)))
          )

(run-specs)
