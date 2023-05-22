package com.example.project2_wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import layout.Wishlist

class WishlistAdpter(private val dataSet: MutableList<Wishlist>) :
        RecyclerView.Adapter<WishlistAdpter.ViewHolder>() {

        /**
         * Provide a reference to the type of views that you are using
         * (custom ViewHolder).
         */
        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val nme: TextView
            val price: TextView
            val URL: TextView

            init {
                // Define click listener for the ViewHolder's View.
                nme = view.findViewById(R.id.nme)
                price = view.findViewById(R.id.price)
                URL = view.findViewById(R.id.URL)
            }
        }

        // Create new views (invoked by the layout manager)
        override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
            // Create a new view, which defines the UI of the list item
            val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.wishlist_item, viewGroup, false)

            return ViewHolder(view)
        }

        // Replace the contents of a view (invoked by the layout manager)
        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

            // Get element from your dataset at this position and replace the
            // contents of the view with that element
            viewHolder.nme.text = dataSet[position].Name
            viewHolder.price.text = dataSet[position].price
            viewHolder.nme.text = dataSet[position].URL
        }

        // Return the size of your dataset (invoked by the layout manager)
        override fun getItemCount() = dataSet.size

    }