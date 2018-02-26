package hakobastvatsatryan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class TestLayoutInflater : LayoutInflater {

	private var resource: Int = 0
	private var root: ViewGroup? = null

	constructor(context: Context) : super(context)

	override fun inflate(resource: Int, root: ViewGroup?): View? {
		this.resource = resource
		this.root = root
		return null
	}

	override fun inflate(resource: Int, root: ViewGroup?, attachToRoot: Boolean): View? {
		this.resource = resource
		this.root = root
		return null
	}

	override fun cloneInContext(newContext: Context): LayoutInflater? {
		return null
	}

	fun getResId(): Int {
		return resource
	}

	fun getRoot(): ViewGroup? {
		return root
	}
}