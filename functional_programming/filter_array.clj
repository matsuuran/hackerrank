(defn filter-array [delim lst] 
	(remove #(<= delim %) lst))