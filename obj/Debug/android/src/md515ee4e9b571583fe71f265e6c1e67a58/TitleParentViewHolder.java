package md515ee4e9b571583fe71f265e6c1e67a58;


public class TitleParentViewHolder
	extends md5024271f292c652587ebde13297e986d0.ParentViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("ExpandableRecyclerViewDemo.ViewHolder.TitleParentViewHolder, ExpandableRecyclerViewDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", TitleParentViewHolder.class, __md_methods);
	}


	public TitleParentViewHolder (android.view.View p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == TitleParentViewHolder.class)
			mono.android.TypeManager.Activate ("ExpandableRecyclerViewDemo.ViewHolder.TitleParentViewHolder, ExpandableRecyclerViewDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Views.View, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
