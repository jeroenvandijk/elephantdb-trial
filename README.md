# Elephantdb steps

This project is meant to show my efforts to get  up and running with Elephantdb (https://github.com/nathanmarz/elephantdb). So far I have been able to create shards, start the database locally (version 0.2.0-wip4), connect with the db from the repl. It seems that something in my configuration is wrong since I'm not able to retrieve any data.

## Creating shards with cascalog

    cd shardgen; lein run -m shardgen.core
    
## Trying to run Elephantdb 0.1.0

    cd elephantdb-0-1; lein run -m elephantdb.main global_conf.clj local_conf.clj
    
    12/11/12 09:57:04 INFO elephantdb.log: Sharding domains...
    Exception in thread "main" java.lang.NullPointerException
    	at elephantdb.DomainSpec.parseFromMap(DomainSpec.java:96)
    	at elephantdb.DomainSpec.parseFromStream(DomainSpec.java:92)
    	at elephantdb.DomainSpec.readFromFileSystem(DomainSpec.java:81)
    	at elephantdb.config$read_domain_spec.invoke(config.clj:63)
    	at elephantdb.shard$shard_domains$fn__68.invoke(shard.clj:50)
    	at elephantdb.util$update_vals$iter__300__304$fn__305.invoke(util.clj:36)
    	at clojure.lang.LazySeq.sval(LazySeq.java:42)
    	at clojure.lang.LazySeq.seq(LazySeq.java:60)
    	at clojure.lang.RT.seq(RT.java:466)
    	
## Trying to run Elephantdb 0.2.0-wip4

    cd elephantdb-0-2; lein run -m elephantdb.keyval.core global_conf.clj local_conf.clj
    
    log4j:ERROR Ignoring configuration file [log4j/log4j.properties].
    12/11/12 10:04:51 INFO jackknife.logging: Preparing database...
    12/11/12 10:04:51 INFO jackknife.logging: Starting updater process with an interval of: 60 seconds.
    12/11/12 10:04:51 INFO jackknife.logging: Finished opening domain at /Users/jvandijk/Projects/Github/me/elephantdb-trail/tmp/docs
    12/11/12 10:04:51 INFO jackknife.logging: Starting ElephantDB server...
    
## Trying to run ElephantDB client

  cd client; lein repl
  
    user=> (status)
    #<Status Status(domain_statuses:{})>
    user=> (domains)
    nil
    user=> 

