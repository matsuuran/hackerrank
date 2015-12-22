(defn filter-position [lst]
  (keep-indexed #(if (odd? %1) %2) lst))
