(ns pe-user-testutils.core
  (:require [pe-user-core.core :as core]
            [pe-datomic-utils.core :as ducore]
            [clojure.java.io :refer [resource]]
            [datomic.api :as d]
            [clojure.tools.logging :as log]
            [clj-time.core :as t]))

(defn save-new-authtoken
  [conn user-partition u-entid expiration-date]
  (let [[token txnmap] (core/create-and-save-auth-token-txnmap user-partition
                                                               u-entid
                                                               expiration-date)
        tx @(d/transact conn [txnmap])]
    (d/resolve-tempid (d/db conn) (:tempids tx) (:db/id txnmap))))

(defn save-new-user
  [conn user-partition user]
  (ducore/save-new-entity conn (core/save-new-user-txnmap user-partition user)))
