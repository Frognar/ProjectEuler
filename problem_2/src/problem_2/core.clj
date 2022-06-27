(ns problem-2.core)

(defn fibonacci-sequence [n]
  (let [fib
        ((fn build-fib [a b]
           (lazy-seq (cons a (build-fib b (+ a b))))
           ) 0 1)]
    (rest (take (+ n 1) fib)))
  )

(defn sum-first-n-even-fibonacci-numbers [n]
  (reduce + (filter even? (fibonacci-sequence n)))
  )