(defn factorial [x]
  (apply * (range 1 (+ x 1))))

(dotimes [n 20]
  (println "the factorial of" n "is: " (factorial n)))

(println
 (factorial))

