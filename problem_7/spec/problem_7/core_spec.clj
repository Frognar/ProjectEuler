(ns problem-7.core-spec
  (:require [speclj.core :refer :all]
            [problem-7.core :refer :all]
            [clojure.data.int-map :as i]))

(describe "Remove multiples of first"
          (it "should be {} for {2}"
              (should= #{} (remove-multiples-of-first (i/int-set [2]))))
          (it "should be {3} for {2 3}"
              (should= #{3} (remove-multiples-of-first (i/int-set [2 3]))))
          (it "should be {3} for {2 3 4}"
              (should= #{3} (remove-multiples-of-first (i/int-set [2 3 4]))))
          (it "should be {3 5} for {2 3 4 5}"
              (should= #{3 5} (remove-multiples-of-first (i/int-set [2 3 4 5]))))
          (it "should be {4 5} for {3 4 5 6}"
              (should= #{4 5} (remove-multiples-of-first (i/int-set [3 4 5 6]))))
          (it "should be {3 5} for {2 3 4 5}"
              (should= #{3 5 7 9 11 13 15} (remove-multiples-of-first (i/int-set [2 3 4 5 6 7 8 9 10 11 12 13 14 15 16]))))
          )

(describe "sieve od eratosthenes"
          (it "should be [] for n = 1"
              (should= [] (sieve 1)))
          (it "should be [2] for n = 2"
              (should= [2] (sieve 2)))
          (it "should be [2 3] for n = 3"
              (should= [2 3] (sieve 3)))
          (it "should be [2 3] for n = 4"
              (should= [2 3] (sieve 4)))
          (it "should be [2 3 5] for n = 5"
              (should= [2 3 5] (sieve 5)))
          (it "should be [2 3 5 7 11 13 17 19 23] for n = 25"
              (should= [2 3 5 7 11 13 17 19 23] (sieve 25)))
          (it "should be [2 3 5 7 11 13 17 19 23 29] for n = 30"
              (should= [2 3 5 7 11 13 17 19 23 29] (sieve 30)))
          )

(run-specs)