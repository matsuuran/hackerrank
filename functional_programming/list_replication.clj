 (defn list-replication [num lst] 
  (dotimes [i (count lst)] 
    (dotimes [j num] (println (nth lst i)))))


