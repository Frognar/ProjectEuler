(ns problem1.core)

(defn sum-multiples-3-5 [limit]
  (let [threes (range 3 (inc limit) 3)
        fives (range 5 (inc limit) 5)]
   (reduce + (set (concat threes fives)))))