(ns problem-6.core)

(defn square [n]
  (* n n))

(defn sum-of-squares-up-to [n]
  (reduce + (map square (range (inc n)))))

(defn square-of-sum-up-to [n]
  (square (reduce + (range (inc n)))))

(defn sum-square-difference [n]
  (- (square-of-sum-up-to n) (sum-of-squares-up-to n)))