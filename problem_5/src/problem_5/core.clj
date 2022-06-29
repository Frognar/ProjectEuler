(ns problem-5.core)

(defn greatest-common-divisor [a b]
  (if (zero? b)
    a
    (greatest-common-divisor b (mod a b))))

(defn least-common-multiple
  ([a b]
   (/ (* a b) (greatest-common-divisor a b)))
  ([numbers]
    (reduce least-common-multiple 1 numbers))
  )
