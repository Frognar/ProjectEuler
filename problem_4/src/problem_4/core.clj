(ns problem-4.core)

(defn is-palindrome [number]
  (let [s (str number)]
    (= s (apply str (reverse s)))))

(defn products [lowest highest]
  (set (for [i (range lowest (inc highest))
        j (range lowest (inc highest))]
  (* i j))))

(defn palindrome-products [lowest highest]
  (let [multiplies (products lowest highest)]
    (set (filter #(is-palindrome %) multiplies))))

(defn largest-palindrome-product [lowest highest]
  (let [palindromes (palindrome-products lowest highest)]
    (reduce max palindromes)))