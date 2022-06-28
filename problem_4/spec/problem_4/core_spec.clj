(ns problem-4.core-spec
  (:require [speclj.core :refer :all]
            [problem-4.core :refer :all]))

(describe "Is palindrome"
          (it "should be true if number is one digit"
              (should= true (is-palindrome 1))
              (should= true (is-palindrome 2))
              (should= true (is-palindrome 3))
              (should= true (is-palindrome 4))
              (should= true (is-palindrome 5))
              (should= true (is-palindrome 6))
              (should= true (is-palindrome 7))
              (should= true (is-palindrome 8))
              (should= true (is-palindrome 9)))
          (it "should be false if digits are different in two digit number"
              (should= false (is-palindrome 10))
              (should= false (is-palindrome 12))
              (should= false (is-palindrome 13))
              (should= false (is-palindrome 14)))
          (it "should be true if digits are same in two digit number"
              (should= true (is-palindrome 11))
              (should= true (is-palindrome 22))
              (should= true (is-palindrome 33))
              (should= true (is-palindrome 44))
              (should= true (is-palindrome 99)))
          (it "should be true if first and last digit are the same in three digit number"
              (should= true (is-palindrome 101))
              (should= true (is-palindrome 141))
              (should= true (is-palindrome 151))
              (should= true (is-palindrome 292))
              (should= true (is-palindrome 303)))
          )

(describe "Sequence of multiplies from min to max"
          (it "should be {1} if min=max=1"
              (should= #{1} (products 1 1)))
          (it "should be {1 2 4} if min=1 max=2"
              (should= #{1 2 4} (products 1 2)))
          (it "should be {1 2 3 4 6 9} if min=1 max=2"
              (should= #{1 2 3 4 6 9} (products 1 3)))
          (it "should be {100 110 121} if min=10 max=11"
              (should= #{100 110 121} (products 10 11)))
          )

(describe "Sequence of palindrome multiplies from min to max"
          (it "should be {1} if min=max=1"
              (should= #{1} (palindrome-products 1 1)))
          (it "should be {121} if min=10 max=11"
              (should= #{121} (palindrome-products 10 11)))
          (it "should be {121 242 252 272 323 414 484 525 575} if min=10 max=11"
              (should= #{121 242 252 272 323 414 484 525 575} (palindrome-products 10 25)))
          )

(describe "Biggest palindrome multiplies from min to max"
          (it "should be {121} if min=10 max=11"
              (should= 121 (largest-palindrome-product 10 11)))
          (it "should be 575 if min=10 max=11"
              (should= 575 (largest-palindrome-product 10 25)))
          )
(run-specs)
