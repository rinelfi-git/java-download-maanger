package me.rinelfi.view_model;

import me.rinelfi.model.DownloadFile;
import me.rinelfi.model.Category;

import java.util.ArrayList;
import java.util.List;

public class Window implements ViewModel {
	private List<View> _views;
	private Category _active_category;
	private List<DownloadFile> _files;
	
	public Window() {
		this._active_category = Category.ALL;
		this._files = new ArrayList<>();
		this._views = new ArrayList<>();
	}
	
	@Override
	public void populate(View view) {
		this._views.add(view);
	}
	
	@Override
	public void update(View exclude) {
		this._views.forEach(view -> {
			if (exclude == null || view != exclude)
				view.listen(this);
		});
	}
}
