# pe-user-testutils

[![Build Status](https://travis-ci.org/evanspa/pe-user-testutils.svg)](https://travis-ci.org/evanspa/pe-user-testutils)

A Clojure library containing a set of helper functions to aid in unit testing
code that depends on the functionality of the pe-user-* libraries
([pe-user-core](https://github.com/evanspa/pe-user-core) and
[pe-user-rest](https://github.com/evanspa/pe-user-rest)).

pe-user-testutils is part of the
[pe-* Clojure Library Suite](#pe--clojure-library-suite).

<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**
- [Documentation](#documentation)
- [Installation](#installation)
- [pe-* Clojure Library Suite](#pe--clojure-library-suite)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

## Documentation

* [API Docs](http://evanspa.github.com/pe-user-testutils)

## Installation

pe-user-testutils is available from Clojars.  Add the following dependency to your
`project.clj` file:

```
[pe-user-testutils "0.0.3"]
```
## pe-* Clojure Library Suite
The pe-* Clojure library suite is a set of Clojure libraries to aid in the
development of Clojure and Java based applications.
*(Each library is available on Clojars.)*
+ **[pe-core-utils](https://github.com/evanspa/pe-core-utils)**: provides a set
  of various collection-related, date-related and other helpers functions.
+ **[pe-datomic-utils](https://github.com/evanspa/pe-datomic-utils)**: provides
  a set of helper functions for working with [Datomic](https://www.datomic.com).
+ **[pe-datomic-testutils](https://github.com/evanspa/pe-datomic-testutils)**: provides
  a set of helper functions to aid in unit testing Datomic-enabled functions.
+ **[pe-user-core](https://github.com/evanspa/pe-user-core)**: provides
  a set of functions for modeling a generic user, leveraging Datomic as a
  backend store.
+ **pe-user-testutils**: this library.
+ **[pe-apptxn-core](https://github.com/evanspa/pe-apptxn-core)**: provides a
  set of functions implementing the server-side core data layer of the
  PEAppTransaction Logging Framework.
+ **[pe-rest-utils](https://github.com/evanspa/pe-rest-utils)**: provides a set
  of functions for building easy-to-version hypermedia REST services (built on
  top of [Liberator](http://clojure-liberator.github.io/liberator/).
+ **[pe-rest-testutils](https://github.com/evanspa/pe-rest-testutils)**: provides
  a set of helper functions for unit testing web services.
+ **[pe-user-rest](https://github.com/evanspa/pe-user-rest)**: provides a set of
  functions encapsulating an abstraction modeling a user within a REST API
  and leveraging [Datomic](http://www.datomic.com).
+ **[pe-apptxn-restsupport](https://github.com/evanspa/pe-apptxn-restsupport)**:
  provides a set of functions implementing the server-side REST layer of the
  PEAppTransaction Logging Framework.
