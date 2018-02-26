package hakobastvatsatryan

import android.app.Application
import android.content.Context
import android.content.res.TypedArray
import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.mockito.Matchers.any
import android.util.AttributeSet;
import hakobastvatsatryan.dropdowntextview.R
import org.junit.Test
import org.mockito.Matchers.eq
import org.mockito.Mockito.`when`
import org.apache.tools.ant.types.Assertions

import org.assertj.core.api.Assertions.assertThat
import org.mockito.Mockito.mock

/**
 * Created by altafshaikh on 26/02/18.
 */

@RunWith(RobolectricTestRunner::class)
@Config(application = Application::class)
class DropdownTextViewTest {

//	val secondDropdownTextView: DropdownTextView = findViewById(R.id.second_dropdown_text_view)
//	secondDropdownTextView.setTitleText(R.string.dropdown_title_text)
//	secondDropdownTextView.setContentText(R.string.dropdown_content_text)
//
//	val thirdDropdownTextViewSecond = DropdownTextView.Builder(this)
//			.setTitleTextColorRes(R.color.third_drop_down_text_view_title)
//			.setTitleTextRes(R.string.dropdown_title_text)
//			.setContentTextColorRes(R.color.third_drop_down_text_view_content)
//			.setContentTextRes(R.string.dropdown_content_text)
//			.setRegularBackgroundDrawableRes(R.drawable.bg_third_dropdown_text_view_regular)
//			.setExpandedBackgroundDrawableRes(R.drawable.bg_third_dropdown_text_view_expanded)

	@Test
	fun shouldInflatedWithViewDropDownText() {
		var context = mock(Context::class.java)
		var typedArray = mock(TypedArray::class.java)
		var inflatore = TestLayoutInflater(context)
		initMockAttribute(context,typedArray,inflatore)
		var dropDownView = DropdownTextView(context,mock(AttributeSet::class.java))

		assertThat(inflatore.getResId()).isEqualTo(R.layout.view_dropdown_text_view)
		assertThat(inflatore.getRoot()).isEqualTo(dropDownView)
	}

	fun initMockAttribute(context: Context, typedArray: TypedArray, layoutInflater: TestLayoutInflater) {
		`when`(context.obtainStyledAttributes(any(AttributeSet::class.java), eq(R.styleable.DropdownTextView)))
				.thenReturn(typedArray)
		`when`(context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).thenReturn(layoutInflater)
	}
}