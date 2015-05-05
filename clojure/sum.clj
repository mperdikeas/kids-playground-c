(defn carre [ n ]
  ( * n n))

(println
 (apply +
    (map carre
         (take 3
               (filter even?
                       (range))))))









  
