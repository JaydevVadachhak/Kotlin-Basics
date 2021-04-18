package oopConcepts.visibilityModifiers

public fun sum(a: Int, b: Int) = a+b
//accessible from everywhere

private fun difference(a: Int, b: Int) = a-b
//only within file or class where it declared

//protected fun product(a: Int, b: Int) = a*b
//protected can't be applied to top level function
//only accessible from subclass

internal fun division(a: Int, b: Int) = a/b
//same package/module