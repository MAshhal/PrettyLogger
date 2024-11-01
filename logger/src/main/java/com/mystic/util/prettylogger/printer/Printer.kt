package com.mystic.util.prettylogger.printer

import com.mystic.util.prettylogger.adapter.LogAdapter

/**
 * Created using Android Studio Ladybug
 * User: mE
 * Date: Mon, Oct 28, 2024
 * Time: 10:15 AM
 */

/**
 * A proxy interface to enable additional operations.
 * Contains all possible Log message usages.
 */
interface Printer {
    fun addAdapter(adapter: LogAdapter)

    fun tag(tag: String?): Printer

    fun debug(message: Any?, vararg args: Any?)

    fun debug(message: Any?, throwable: Throwable? = null)

    fun debug(throwable: Throwable? = null, message: () -> Any?)

    fun error(message: Any?, vararg args: Any?)

    fun error(message: Any?, throwable: Throwable? = null)

    fun error(throwable: Throwable? = null, message: () -> Any?)

    fun warn(message: Any?, vararg args: Any?)

    fun warn(message: Any?, throwable: Throwable? = null)

    fun warn(throwable: Throwable? = null, message: () -> Any?)

    fun info(message: Any?, vararg args: Any?)

    fun info(message: Any?)

    fun info(message: () -> Any?)

    fun verbose(message: Any?, vararg args: Any?)

    fun verbose(message: Any?)

    fun verbose(message: () -> Any?)

    fun wtf(message: Any?, vararg args: Any?)

    fun wtf(message: Any?, throwable: Throwable? = null)

    fun wtf(throwable: Throwable? = null, message: () -> Any?)

    /**
     * Formats the given json content and print it
     */
    fun debugJson(json: String?)

    /**
     * Formats the given json content and print it
     */
    fun debugJson(json: () -> String?)

    /**
     * Formats the given xml content and print it
     */
    fun debugXml(xml: String?)

    /**
     * Formats the given xml content and print it
     */
    fun debugXml(xml: () -> String?)

    fun log(priority: Int, tag: String? = null, message: Any?, throwable: Throwable? = null)

    fun log(priority: Int, tag: String? = null, throwable: Throwable? = null, message: () -> Any?)

    fun log(priority: Int, tag: String? = null, message: Any?, vararg args: Any?)

    fun clearLogAdapters()
}