# Singleton Concept

1. Only one instance created
2. Guarantees control of a resource
3. Lazily loaded

Examples::

* Runtime
* logger
* Spring Beans
* Graphical Manager

### Design

* Class is responsible for life cycle
* Static in nature
* Needs to be thread safety
* Private instance
* Private constructor
* No Parameters required for the constructor


### Pitfall

* Often over used
* Difficult to unit test
* If not careful, not thread safe
* sometimes confused for factory
* java.util.Calendat is NOT a singleton
	** Prototype
	
Contrast::

Singleton::

* Returns same instance
	** one constructor method with no-arg
* No interface	

Factory::

* Return various instances
	* Multiple constructor
* Interface driven
* Adaptable to environment more easily