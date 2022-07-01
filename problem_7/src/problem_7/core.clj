(ns problem-7.core
  (:require [clojure.set :as set]
            [clojure.data.int-map :as i]))

(defn remove-multiples-of-first [candidates]
  (let [first-candidate (first candidates)
        multiples (i/int-set (range first-candidate
                                    (inc (last candidates))
                                    first-candidate))]
    (set/difference candidates multiples)))

(defn sieve [n]
  (loop [candidates (i/int-set (range 2 (inc n)))
         primes []]
    (if (empty? candidates)
      primes
      (recur (remove-multiples-of-first candidates)
             (conj primes (first candidates))))))
