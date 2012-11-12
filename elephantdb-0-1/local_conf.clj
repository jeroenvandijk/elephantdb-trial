{ :local-dir "/Users/jvandijk/Projects/Github/me/elephantdb-trail/tmp"
  :max-online-download-rate-kb-s 1024
  :update-interval-s 60  ;; check for domain updates every minute
  :local-db-conf {"elephantdb.persistence.JavaBerkDB" {}
                  "elephantdb.persistence.TokyoCabinet" {}
                  }
  :hdfs-conf {"fs.default.name" "file:///tmp/elephant"}
  :num-shards 32
}