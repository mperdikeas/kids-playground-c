(defn isMultipleOf3? [n]
  (zero? (rem n 3)))

(println "is 9 multiple of 3?" (isMultipleOf3? 9))
(println "is 10 multiple of 3?" (isMultipleOf3? 10))
(defn result [ n ]
  (apply * (filter isMultipleOf3?
                   (range 1 (inc n)))))

(println "the answer is: " (result 20))
