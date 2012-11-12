{:local-root "/Users/jvandijk/Projects/Github/me/elephantdb-trail/tmp"
 :download-rate-limit 1024
 :update-interval-s 60 ;; check for domain updates every minute

 :replication 1
 :hosts ["localhost" ]
 :port 3578
 :domains { "docs"  "/Users/jvandijk/Projects/Github/me/elephantdb-trail/data/domains/docs" }

 :local-db-conf {"elephantdb.persistence.JavaBerkDB" {}
                 "elephantdb.persistence.TokyoCabinet" {} }

  :hdfs-conf {"fs.default.name" "file:////tmp/elephantXXX"}
}