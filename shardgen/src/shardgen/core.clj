(ns shardgen.core
  (:use [cascalog.api]
        [cascalog.elephantdb.keyval :only [keyval-tap]]))

(defn -main [& args]
  (?- (keyval-tap "../data/domains/docs" :spec { :num-shards 32 
                                                 :coordinator "elephantdb.persistence.JavaBerkDB" 
                                                 :shard-scheme "elephantdb.partition.HashModScheme"})
      (vec {0 1, 1 2, 2 3, 3 0, 4 0, 5 1})))