(ns user
  (:require [elephantdb.keyval.core :as kc]
            [clojure.stacktrace]))
  
(defn print-stack-trace []
  (clojure.stacktrace/print-stack-trace *e))

(defn status []
  (kc/with-kv-connection "localhost" 3578 handler (.getStatus (kc/kv-service "docs"))))
  
(defn domains []
  (kc/with-kv-connection "localhost" 3578 handler (.getDomains (kc/kv-service "docs"))))
