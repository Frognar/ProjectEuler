(ns problem-5.core-spec
  (:require [speclj.core :refer :all]
            [problem-5.core :refer :all]))

(describe "greatest common divisor"
          (it "should be 1 for prime numbers"
              (should= 1 (greatest-common-divisor 5 7)))
          (it "should be b for a = b"
              (should= 3 (greatest-common-divisor 3 3)))
          (it "should be b for b that divides a"
              (should= 2 (greatest-common-divisor 6 2)))
          (it "should be 3 for 21 and 27"
              (should= 3 (greatest-common-divisor 21 27)))
          )

(describe "least common multiple"
          (it "should be 1 for []"
              (should= 1 (least-common-multiple [])))
          (it "should be n for [n]"
              (should= 1 (least-common-multiple [1]))
              (should= 2 (least-common-multiple [2])))
          (it "should be 2 for [1 2]"
              (should= 2 (least-common-multiple [1 2])))
          (it "should be 6 for [6 3]"
              (should= 6 (least-common-multiple [6 3])))
          (it "should be 2520 for [1..10]"
              (should= 2520 (least-common-multiple (range 1 11))))
          (it "should be 232792560 for [1..20]"
              (should= 232792560 (least-common-multiple (range 1 21))))
          )

(run-specs)